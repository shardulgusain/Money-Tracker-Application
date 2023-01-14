import React from 'react'
import { Card, CardBody } from 'reactstrap'

function Header() {
  return (
    <div>
      <Card className='bg-warning'>
        <CardBody>
        <h1 className='display-4 text-center'>Money Tracker</h1>
        </CardBody>
      </Card>  
    </div>
  )
}

export default Header