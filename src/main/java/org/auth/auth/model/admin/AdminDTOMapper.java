package org.auth.auth.model.admin;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class AdminDTOMapper implements Function<Admin, AdminDTOImp> {
    @Override
    public AdminDTOImp apply(@NotNull Admin admin) {
        return new AdminDTOImp(admin.getId()
                ,admin.getFirstName()
                ,admin.getLastName()
                ,admin.getEmail()
                ,admin.getCreatedAt()
                ,admin.getUpdatedAt()
                ,admin.isEnabled()
                ,admin.getRole()
        );

    }
}
