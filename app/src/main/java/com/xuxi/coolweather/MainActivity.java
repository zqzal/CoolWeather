package com.xuxi.coolweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragment(new ChooseAreaFragment());
    }

    public void replaceFragment(Fragment fragment){
        //动态添加碎片
        //创建待添加的碎片
        //获取FragmentManager,在活动中可以直接调用getSupportFragemtnManager方法
        FragmentManager fragmentManager = getSupportFragmentManager();
        //开始一个事务，通过调用beginTransaction
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //向容器内添加或替换碎片，一般使用replace方法实现，需要传入容器的id和待添加的碎片实例
        transaction.replace(R.id.choose,fragment);
//        transaction.addToBackStack(null);
        //提交事务，调用commit方法来完成。
        transaction.commit();
    }


}
