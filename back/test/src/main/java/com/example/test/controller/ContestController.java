package com.example.test.controller;
import com.example.test.dto.ContestResponseDto;
import com.example.test.entity.Contest;
import com.example.test.service.ContestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/contest")
@RequiredArgsConstructor
public class ContestController {
    private final ContestService contestService;

    @GetMapping("/info")
    public ResponseEntity<List<ContestResponseDto>> getAllContests() {
        List<Contest> contests = contestService.getContests();
        List<ContestResponseDto> contestDtos = contests.stream()
                .map(contest -> new ContestResponseDto(
                        contest.getId(),
                        contest.getName(),
                        contest.getCategory(),
                        contest.getEndDate(),
                        contest.getUrl(),
                        contest.getImgUrl())
                )
                .collect(Collectors.toList());

        return ResponseEntity.ok(contestDtos);
    }
}
