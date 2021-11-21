package com.example.teams.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name ="members")
public class Member {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
    private Long id;

	@Column(name = "first_name")
	String firstName;

	@Column(name = "last_name")
	String lastName;

	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinTable(name = "member_teams", joinColumns = @JoinColumn(name = "member_id"), inverseJoinColumns = @JoinColumn(name = "team_id"))
	private List<Team> teams;

}
