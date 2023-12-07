// src/User.js
import React, { useState } from 'react';

const User = () => {
  const [users, setUsers] = useState([]);
  const [newUser, setNewUser] = useState({
    role: 'Administrator',
    position: 'Administrator',
    password: '',
  });
  const [selectedUserIndex, setSelectedUserIndex] = useState(null);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setNewUser((prevUser) => ({ ...prevUser, [name]: value }));
  };

  const addUser = () => {
    if (selectedUserIndex !== null) {
      // If editing, update the user
      const updatedUsers = [...users];
      updatedUsers[selectedUserIndex] = newUser;
      setUsers(updatedUsers);
      setSelectedUserIndex(null);
    } else {
      // If creating, add a new user
      setUsers([...users, newUser]);
    }

    setNewUser({
      role: 'Administrator',
      position: 'Administrator',
      password: '',
    });
  };

  const editUser = (index) => {
    setSelectedUserIndex(index);
    const selectedUser = users[index];
    setNewUser(selectedUser);
  };

  const deleteUser = (index) => {
    const updatedUsers = [...users];
    updatedUsers.splice(index, 1);
    setUsers(updatedUsers);
    setSelectedUserIndex(null);
  };

  
  return (
    <div>
      <div className='card-header card text-white bg-danger text-md-start m-4'>Usuarios</div>

      <form className="d-flex col-2 m-4 ">
        <input className="form-control me-2" type="recobros" placeholder="recobros" aria-label="recobros"></input>
        <button className="btn btn-outline-success" type="submit">Search</button>
      </form>

      <div className='container mt-5'>
        <div className="row">
          <div className='card col col-3 m-4'>
            <label>
              Role:
              <select name="role" value={newUser.role} onChange={handleInputChange}>
                <option value="Administrator">Administrator</option>
                <option value="Support">Support</option>
                <option value="Assistant">Assistant</option>
              </select>
            </label>
          </div>

          <div className='card col col-3 m-4'>
            <label>
              Position:
              <select name="position" value={newUser.position} onChange={handleInputChange}>
                <option value="Auditor">Auditor</option>
                <option value="Administrator">Administrator</option>
                <option value="Developer">Developer</option>
                <option value="Manager">Manager</option>
              </select>
            </label>
          </div>

          <div className='card col col-3 m-4'>
            <label>
              Password:
              <input
                type="password"
                name="password"
                value={newUser.password}
                onChange={handleInputChange}
              />
            </label>
          </div>

          <button onClick={addUser}>
            {selectedUserIndex !== null ? 'Update User' : 'Create User'}
          </button>

          <ul>
            {users.map((user, index) => (
              <li key={index}>
                {user.role} - {user.position}{' '}
                <button onClick={() => editUser(index)}>Edit</button>
                <button onClick={() => deleteUser(index)}>Delete</button>
              </li>
            ))}
          </ul>
        </div>
      </div>
    </div>
  );
};

export default User;
