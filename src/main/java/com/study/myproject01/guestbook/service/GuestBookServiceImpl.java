package com.study.myproject01.guestbook.service;

import com.study.myproject01.guestbook.vo.GuestBookVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestBookServiceImpl implements GuestBookService{

    @Override
    public List<GuestBookVO> guestBookList() {
        return List.of();
    }

    @Override
    public GuestBookVO guestBookDetail(String g_idx) {
        return null;
    }

    @Override
    public int guestBookWInsert(GuestBookVO gvo) {
        return 0;
    }

    @Override
    public int guestBookDelete(String g_idx) {
        return 0;
    }

    @Override
    public int guestBookUpdate(GuestBookVO gvo) {
        return 0;
    }
}
