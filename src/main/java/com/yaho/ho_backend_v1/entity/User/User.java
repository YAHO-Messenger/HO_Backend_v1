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
    @Column(name = "id")
    private Long id;

    @Column(unique = true, name = "id")
    private String Email;

    @Column(name = "pw")
    private String Pw;

    @Column(name = "name")
    private String Name;


}
