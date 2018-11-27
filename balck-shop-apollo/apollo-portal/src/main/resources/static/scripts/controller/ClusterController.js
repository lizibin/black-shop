cluster_module.controller('ClusterController',
                          ['$scope', '$location', '$window', 'toastr', 'AppService', 'EnvService', 'ClusterService',
                           'AppUtil',
                           function ($scope, $location, $window, toastr, AppService, EnvService, ClusterService,
                                     AppUtil) {

                               var params = AppUtil.parseParams($location.$$url);
                               $scope.appId = params.appid;

                               $scope.step = 1;
                               
                               $scope.submitBtnDisabled = false;
                               
                               EnvService.find_all_envs().then(function (result) {
                                   $scope.envs = [];
                                   result.forEach(function (env) {
                                       $scope.envs.push({name: env, checked: false});

                                   });
                                   $(".apollo-container").removeClass("hidden");
                               }, function (result) {
                                   toastr.error(AppUtil.errorMsg(result), "加载环境信息出错");
                               });

                               $scope.clusterName = '';

                               $scope.switchChecked = function (env,  $event) {
                                   env.checked = !env.checked;
                                   $event.stopPropagation();
                               };

                               $scope.toggleEnvCheckedStatus = function (env) {
                                   env.checked = !env.checked;
                               };

                               $scope.create = function () {

                                   var noEnvChecked = true;
                                   $scope.envs.forEach(function (env) {
                                       if (env.checked) {
                                           noEnvChecked = false;
                                           $scope.submitBtnDisabled = true;
                                           ClusterService.create_cluster($scope.appId, env.name,
                                                                         {
                                                                             name: $scope.clusterName,
                                                                             appId: $scope.appId
                                                                         }).then(function (result) {
                                               toastr.success(env.name, "集群创建成功");
                                               $scope.step = 2;
                                               $scope.submitBtnDisabled = false;
                                           }, function (result) {
                                               toastr.error(AppUtil.errorMsg(result), "集群创建失败");
                                               $scope.submitBtnDisabled = false;
                                           })
                                       }
                                   });

                                   if (noEnvChecked){
                                       toastr.warning("请选择环境");
                                   }

                               };

                           }]);
