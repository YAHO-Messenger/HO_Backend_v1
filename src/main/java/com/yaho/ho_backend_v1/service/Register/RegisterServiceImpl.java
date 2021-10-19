package com.yaho.ho_backend_v1.service.Register;

import com.yaho.ho_backend_v1.entity.User.User;
import com.yaho.ho_backend_v1.entity.User.UserRepository;
import com.yaho.ho_backend_v1.exception.AlreadyUserExistException;
import com.yaho.ho_backend_v1.payload.Request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String register(RegisterRequest request){
        try {
            userRepository.save(
                    User.builder()
                            .Id(request.getId())
                            .Pw(passwordEncoder.encode(request.getPw()))
                            .Name(request.getName())
                            .PhoneNumber(request.getPhoneNumber())
                            .build()
            );
            return "Success";
        }catch (Exception e){
            throw new AlreadyUserExistException();
        }
    }
}
