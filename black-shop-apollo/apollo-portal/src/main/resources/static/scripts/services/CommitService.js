appService.service('CommitService', ['$resource', '$q', function ($resource, $q) {
    var commit_resource = $resource('', {}, {
        find_commits: {
            method: 'GET',
            isArray: true,
            url: '/apps/:appId/envs/:env/clusters/:clusterName/namespaces/:namespaceName/commits?page=:page'
        }
    });
    return {
        find_commits: function (appId, env, clusterName, namespaceName, page, size) {
            var d = $q.defer();
            commit_resource.find_commits({
                                             appId: appId,
                                             env: env,
                                             clusterName: clusterName,
                                             namespaceName: namespaceName,
                                             page: page,
                                             size: size
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
