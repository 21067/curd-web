package com.zzd.assessment2.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
        private int userId;
        private String username;
        private String password;
        private LocalDateTime createdAt;
}
