package com.example.somkiat.demo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.somkiat.demo.databinding.ActivityMainBinding;
import com.example.somkiat.demo.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        User defaultUser = new User();
        defaultUser.setFirstName("Somkiat");
        defaultUser.setLastName("Puisungnoen");
        updateUser(defaultUser);
    }

    public void update(View view) {
        User updateUser = new User();
        updateUser.setFirstName("New");
        updateUser.setLastName("OK!");
        updateUser(updateUser);
    }

    private void updateUser(User updatedUser) {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(updatedUser);
    }

}
