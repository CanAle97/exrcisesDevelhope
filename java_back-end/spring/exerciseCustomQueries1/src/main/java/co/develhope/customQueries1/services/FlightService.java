package co.develhope.customQueries1.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FlightService {

    public String generateString(int capacity) {
        final String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder(capacity);
        for(int i = 0; i < capacity; i++){
            stringBuilder.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return String.valueOf(stringBuilder);
    }
}