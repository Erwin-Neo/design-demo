package com.kyle.design.command.party.control;

import com.kyle.design.command.party.facility.TVShow;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-23 11:06
 * @description :
 */
public class TVOnCommand implements Command {

    TVShow tvShow;

    public TVOnCommand(TVShow tvShow) {
        this.tvShow = tvShow;
    }

    @Override
    public void execute() {
        tvShow.on();
    }

    @Override
    public void undo() {
        tvShow.off();
    }
}
