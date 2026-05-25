function UserDetails(props) {


    let userdata = props.userdetails





    return (

        <>




            <table>

                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Image</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Maiden Name</th>
                        <th>Age</th>
                        <th>Gender</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Username</th>
                        <th>Password</th>
                        <th>Birth Date</th>
                        <th>Blood Group</th>

                    </tr>
                </thead>

                <tbody>
                    {


                        userdata.map(user => (
                            <tr>
                                <td>{user.id}</td>
                                <td>
                                    <img src={user.image} alt="" />
                                </td>
                                <td>{user.firstName}</td>
                                <td>{user.lastName}</td>
                                <td>{user.maidenName}</td>
                                <td>{user.age}</td>
                                <td>{user.gender}</td>
                                <td>{user.email}</td>
                                <td>{user.phone}</td>
                                <td>{user.username}</td>
                                <td>{user.password}</td>
                                <td>{user.birthDate}</td>
                                <td>{user.bloodGroup}</td>

                            </tr>










                        ))

                    }
                </tbody>

            </table>


        </>

    )
}

export default UserDetails