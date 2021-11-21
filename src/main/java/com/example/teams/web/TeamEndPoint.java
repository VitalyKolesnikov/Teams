package com.example.teams.web;

import com.example.teams.domain.Member;
import com.example.teams.domain.Team;
import com.example.teams.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamEndPoint {

    private final TeamService teamService;

    public TeamEndPoint(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping(path = "/{id}/members")
    public List<Member> getTeamMembers(@PathVariable Long id) {
        return teamService.getAllTeamMember(id);
    }

}
