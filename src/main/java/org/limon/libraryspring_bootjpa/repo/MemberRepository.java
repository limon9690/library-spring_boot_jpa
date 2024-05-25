package org.limon.libraryspring_bootjpa.repo;

import org.limon.libraryspring_bootjpa.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
