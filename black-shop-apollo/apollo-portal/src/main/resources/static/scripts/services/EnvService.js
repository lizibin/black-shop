appService.service('EnvService', ['$resource', '$q', function ($resource, $q) {
    var env_resource = $resource('/envs', {}, {
        find_all_envs:{
            method: 'GET',
            isArray: true,
            url:'/envs'
        }
    });
    return {
        find_all_envs: function () {
            var d = $q.defer();
            env_resource.find_all_envs({
                                      },
                                      function (result) {
                                          d.resolve(result);
                                      }, function (result) {
                    d.reject(result);
                });
            return d.promise;
        }
    }
}]);
