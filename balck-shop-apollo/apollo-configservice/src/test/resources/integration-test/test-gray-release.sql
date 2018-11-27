INSERT INTO GrayReleaseRule (`Id`, `AppId`, `ClusterName`, `NamespaceName`, `BranchName`, `Rules`, `ReleaseId`, `BranchStatus`)
VALUES
	(1, 'someAppId', 'default', 'application', 'gray-branch-1', '[{"clientAppId":"someAppId","clientIpList":["1.1.1.1"]}]', 986, 1);
INSERT INTO GrayReleaseRule (`Id`, `AppId`, `ClusterName`, `NamespaceName`, `BranchName`, `Rules`, `ReleaseId`, `BranchStatus`)
VALUES
	(2, 'somePublicAppId', 'default', 'somePublicNamespace', 'gray-branch-2', '[{"clientAppId":"someAppId","clientIpList":["1.1.1.1"]}]', 985, 1);
