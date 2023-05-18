**PRIORITY**:
    use mousePos to flip cells
    make START, RESET, STOP buttons at bottom 
        working on this: use jPanel child.setLocation(x, y) to set locs
    make logic methods in State class
    figure out how to make shit happen when mouse clicked


**MAYBE**:
    add grid to define square edges


**NOTES**
    gameloop does not need mouseListeners because it's only when the game is started
    when mouse click is detected the VIEW class should determine what button was clicked
        - then state class should update the state based on the click
        - then view class should update the view
    clicking START should start the gameLoop