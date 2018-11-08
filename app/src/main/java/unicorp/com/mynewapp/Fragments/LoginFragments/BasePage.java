package unicorp.com.mynewapp.Fragments.LoginFragments;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import unicorp.com.mynewapp.Activity.LogInActivity;
import unicorp.com.mynewapp.R;
import unicorp.com.mynewapp.Utils.Utils;


public class BasePage extends BaseLoginFragment {
    //private static View view;
    private FragmentManager fragmentManager;
    private  Button btnsignIn;
    private  TextView SignUphere, loginhere, notNow;
    public BasePage() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_base_page, container, false);
        initViews();
        Click();
        setFacebookbtn(R.id.fb_mang);

        //((LogInActivity) getActivity()).setActivityTitle("تسجيل الدخول","Sign in");
        // Inflate the layout for this fragment
        return view;
    }


    private void initViews() {
        fragmentManager = getActivity().getSupportFragmentManager();
        btnsignIn = view.findViewById(R.id.BPSignupWithEmail);
        SignUphere = view.findViewById(R.id.BPcreateAccount);
        loginhere = view.findViewById(R.id.BPLoginNow);
        notNow = view.findViewById(R.id.BpNotNow);

        /*XmlResourceParser xrp = getResources().getXml(R.drawable.text_selector);
        try {
            ColorStateList csl = ColorStateList.createFromXml(getResources(),
                    xrp);

            loginhere.setTextColor(csl);
            notNow.setTextColor(csl);
        } catch (Exception e) {
        }*/
    }

    private void Click() {

        btnsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager
                        .beginTransaction()
                        .setCustomAnimations(R.anim.right_enter, R.anim.left_out)
                        .replace(R.id.frameContainer,
                                new SignUp_Fragment(),
                                Utils.SignUp_Fragment).commit();

            }
        });

        SignUphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager
                        .beginTransaction()
                        .setCustomAnimations(R.anim.right_enter, R.anim.left_out)
                        .replace(R.id.frameContainer, new SignUp_Fragment(),
                                Utils.SignUp_Fragment).commit();

            }
        });

        loginhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager
                        .beginTransaction()
                        .setCustomAnimations(R.anim.right_enter, R.anim.left_out)
                        .replace(R.id.frameContainer, new Login_Fragment(),
                                Utils.Login_Fragment).commit();
            }
        });

        notNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((LogInActivity) getActivity()).finish();
            }
        });

    }


}