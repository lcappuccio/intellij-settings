/**
 * @author ${USER}
 * @date ${DATE} ${TIME}
 */
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

public interface ${Interface_Name} extends javax.ejb.EJBHome {
  ${Remote_Interface_Name} findByPrimaryKey(${PK_Class_Name} key) throws java.rmi.RemoteException, javax.ejb.FinderException;
}
