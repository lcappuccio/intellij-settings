/**
 * @author ${USER}
 * @date ${DATE} ${TIME}
 */
 #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

public interface ${Interface_Name} extends javax.ejb.EJBLocalHome {
  ${Local_Interface_Name} findByPrimaryKey(${PK_Class_Name} key) throws javax.ejb.FinderException;
}
