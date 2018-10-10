package chapter03.mapper;

import chapter03.pojo.Role;

import java.util.List;

/**
 * @author MayerFang
 * @file RoleMapper
 * @Description mapper接口
 * @date 2018/8/19
 */
public interface RoleMapper {

    public int insertRole(Role role);
    public int deleteRole(Long id);
    public int updateRole(Role role);
    public Role getRole(Long id);
    public List<Role> findRoles(String roleName);
}
