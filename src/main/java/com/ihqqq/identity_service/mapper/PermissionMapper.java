package com.ihqqq.identity_service.mapper;

import com.ihqqq.identity_service.dto.request.PermissionRequest;
import com.ihqqq.identity_service.dto.response.PermissionResponse;
import com.ihqqq.identity_service.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);

}
