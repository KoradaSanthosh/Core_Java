import React, { Component } from 'react'

class HeaderComponent extends Component {
    constructor(props){
        super(props)

        this.state = {

        }
    }
  render() {
    return (
      <div>
          <header>
              <nav style={{paddingLeft:"20px"}}className="navbar navbar-expand-md navbar-dark bg-dark">
                  <div><a href="https://javaguides.net" className="navbar-brand">Online corona consultation system</a></div>
              </nav>
          </header>
      </div>
    )
  }
}
export default HeaderComponent