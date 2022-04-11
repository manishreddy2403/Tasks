
package com.controllers;

import com.model.Team;
import com.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    @Qualifier("database")
    private TeamService teamService;

    public TeamController() {

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Team> getTeam() throws SQLException {
        return teamService.getTeam();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Team getTeamById(@PathVariable("id") int bookId) {
        return teamService.getTeamById(bookId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }

    @RequestMapping(path = "/update",method = RequestMethod.PUT)
    public Team updateTeam(@RequestBody Team team) {
        return teamService.updateTeam(team);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteTeam(@RequestBody Team team) {
       teamService.deleteTeam(team);

    }

}
