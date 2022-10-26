package io.github.cassio.parameter.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParameterImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParameterImplementationApplication.class, args);
	}
    
    public static String readFile(final String path, final ClassLoader loader) {
    	final StringBuilder content = new StringBuilder();
        try (InputStream inputStream = loader.getResourceAsStream(path);
             InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

        	
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                content.append(line);
            }

        } catch (final IOException e) {
            e.printStackTrace();
        }
		
		return content.toString();
    }
}
