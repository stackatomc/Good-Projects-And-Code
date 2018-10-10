package chapter03.utils;

import chapter03.mapper.RoleMapper;
import chapter03.pojo.Role;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;

/**
 * @author MayerFang
 * @file ${FILE}
 * @Description
 * @date 2018/8/20
 */
public class Chapter03Main {

    public static void main(String[] args) {
        Logger log= Logger.getLogger(Chapter03Main.class);
        SqlSession sqlSession=null;
        try{
            sqlSession=SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
            Role role=roleMapper.getRole(1L);
            log.info(role.getRoleName());
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
