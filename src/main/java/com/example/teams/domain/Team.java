package com.example.teams.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "teams")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	String name;

	@ManyToMany(mappedBy = "teams",fetch = FetchType.LAZY)
	private List<Member> members;

}
