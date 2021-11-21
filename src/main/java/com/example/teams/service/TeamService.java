package com.example.teams.service;

import com.example.teams.domain.Member;
import com.example.teams.domain.Team;
import com.example.teams.repository.MemberRepository;
import com.example.teams.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepo;

    public TeamService(TeamRepository teamRepo, MemberRepository memberRepo) {
        this.teamRepo = teamRepo;
    }

    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }

    public List<Member> getAllTeamMember(Long teamId) {
        return teamRepo.getById(teamId).getMembers();
    }

}
