package quick.pager.shop.manage.service.system;

import java.util.List;
import quick.pager.shop.manage.response.system.MenuResponse;
import quick.pager.shop.response.Response;

/**
 * 权限服务
 *
 * @author siguiyang
 * @version 3.0
 */
public interface PermissionService {

    /**
     * 授权
     *
     * @param permissionIds 权限主键集
     * @param roleId        角色主键
     * @return 返回授权成功的提示信息
     */
    Response grant(List<Long> permissionIds, Long roleId);

    /**
     * 根据主键查询parentId 的非路由级权限
     *
     * @param id 权限主键
     * @return 按钮权限列表
     */
    Response<List<MenuResponse>> permission(Long id);
}
