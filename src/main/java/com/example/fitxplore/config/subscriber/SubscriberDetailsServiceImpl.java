package com.example.fitxplore.config.subscriber;

import com.example.fitxplore.dao.SubscriberRepository;
import com.example.fitxplore.entity.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SubscriberDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Subscriber subscriber = subscriberRepository.getSubscriberByUserName(username);
        if(subscriber==null){
            throw new UsernameNotFoundException("Could not find user with the given username");
        }
        CustomSubscriberDetails customSubscriberDetails = new CustomSubscriberDetails(subscriber);
        return customSubscriberDetails;

    }
}