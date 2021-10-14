package com.yaho.ho_backend_v1.entity.User;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name= " user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    private Long userIdx;

    @Column(unique = true, name = "id")
    private String Id;

    @Column(name = "pw")
    private String Pw;

    @Column(name = "name")
    private String Name;

    @Column(name = "phone")
    private String phoneNumber;

}
