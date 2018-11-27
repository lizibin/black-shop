appService.service('FavoriteService', ['$resource', '$q', function ($resource, $q) {
    var resource = $resource('', {}, {
        find_favorites: {
            method: 'GET',
            url: '/favorites',
            isArray: true
        },
        add_favorite: {
            method: 'POST',
            url: '/favorites'
        },
        delete_favorite: {
            method: 'DELETE',
            url: '/favorites/:favoriteId'
        },
        to_top: {
            method: 'PUT',
            url: '/favorites/:favoriteId'
        }
    });
    return {
        findFavorites: function (userId, appId, page, size) {
            var d = $q.defer();
            resource.find_favorites({
                                        userId: userId,
                                        appId: appId,
                                        page: page,
                                        size: size
                                    }, function (result) {
                d.resolve(result);
            }, function (result) {
                d.reject(result);
            });
            return d.promise;
        },
        addFavorite: function (favorite) {
            var d = $q.defer();
            resource.add_favorite({}, favorite, function (result) {
                d.resolve(result);
            }, function (result) {
                d.reject(result);
            });
            return d.promise;
        },
        deleteFavorite: function (favoriteId) {
            var d = $q.defer();
            resource.delete_favorite({
                                          favoriteId: favoriteId
                                      }, function (result) {
                d.resolve(result);
            }, function (result) {
                d.reject(result);
            });
            return d.promise;
        },
        toTop: function (favoriteId) {
            var d = $q.defer();
            resource.to_top({
                                favoriteId: favoriteId
                            }, {}, function (result) {
                d.resolve(result);
            }, function (result) {
                d.reject(result);
            });
            return d.promise;
        }
    }
}]);
