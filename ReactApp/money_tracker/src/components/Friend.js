import React from 'react';
import { Card ,CardBody ,CardTitle ,CardSubtitle ,CardText ,CardFooter ,Button ,Container , } from "reactstrap";
function Friend(key , friend) {
  return (
    <Card>
        <CardBody>
            <CardSubtitle></CardSubtitle>
            <CardText></CardText>
            <Container className='text-center'>
                <Button>Update</Button>
                <Button>Delete</Button>
            </Container>
        </CardBody>
    </Card>
  )
}

export default Friend;