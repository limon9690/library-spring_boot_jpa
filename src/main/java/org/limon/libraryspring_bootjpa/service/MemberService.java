package org.limon.libraryspring_bootjpa.service;

import org.limon.libraryspring_bootjpa.models.Book;
import org.limon.libraryspring_bootjpa.models.Member;
import org.limon.libraryspring_bootjpa.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public Member findById(Integer id) {
        return memberRepository.findById(id).orElse(null);
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public void delete(Integer id) {
        memberRepository.deleteById(id);
    }
}
