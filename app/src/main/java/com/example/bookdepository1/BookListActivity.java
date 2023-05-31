package com.example.bookdepository1;

import androidx.fragment.app.Fragment;

public class BookListActivity extends SinglFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new BookListFragment();
    }
}
