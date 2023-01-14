import React from 'react'
import { ListGroup, ListGroupItem } from 'reactstrap'
import { Link } from 'react-router-dom'

function Menus() {
  return (
    <div className='bg-primary'>
      <ListGroup className='bg-primary'>
        <Link className='list-group-item list-group-action ' tag="a" to="/" action>
          Home
        </Link>
        <Link className='list-group-item list-group-action' tag="a" to="add-friend" action>
          Add Friend
        </Link>
        <Link className='list-group-item list-group-action' tag="a" to="add-transaction" action>
          Add Transaction
        </Link>
        <Link className='list-group-item list-group-action' tag="a" to="view-transaction" action>
          View Transactions
        </Link>
        <Link className='list-group-item list-group-action' tag="a" to="view-friends" action>
          View Friends
        </Link>
        <Link className='list-group-item list-group-action' tag="a" to='about' action>
          About
        </Link>
        <Link className='list-group-item list-group-action' tag="a" to="contact" action>
          Contact
        </Link>
      </ListGroup>
    </div>
  )
}

export default Menus