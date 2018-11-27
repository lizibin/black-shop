INSERT INTO `app` ( `AppId`, `Name`, `OrgId`, `OrgName`, `OwnerName`, `OwnerEmail`, `IsDeleted`, `DataChange_CreatedBy`, `DataChange_LastModifiedBy`)VALUES('test', 'test0620-06', 'default', 'default', 'default', 'default', 0, 'default', 'default');
INSERT INTO `cluster` (`ID`, `Name`, `AppId`, `ParentClusterId`, `IsDeleted`, `DataChange_CreatedBy`, `DataChange_LastModifiedBy`) VALUES (1, 'default', 'test', 0, 0, 'default', 'default');
INSERT INTO `cluster` (`Name`, `AppId`, `ParentClusterId`, `IsDeleted`, `DataChange_CreatedBy`, `DataChange_LastModifiedBy`)VALUES('child-cluster', 'test', 1, 0, 'default', 'default');

INSERT INTO `namespace` (`AppId`, `ClusterName`, `NamespaceName`, `IsDeleted`, `DataChange_CreatedBy`, `DataChange_LastModifiedBy`)VALUES('test', 'default', 'application', 0, 'apollo', 'apollo');
INSERT INTO `namespace` (`AppId`, `ClusterName`, `NamespaceName`, `IsDeleted`, `DataChange_CreatedBy`, `DataChange_LastModifiedBy`)VALUES('test', 'child-cluster', 'application', 0, 'apollo', 'apollo');


