/**
 * This file is part of org.everit.cookbook.core.
 *
 * org.everit.cookbook.core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * org.everit.cookbook.core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with org.everit.cookbook.core.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.cookbook;

public class ImmutableUser {

    private final String firstName;

    private final String lastName;

    private final long userId;

    public ImmutableUser(final UserDTO userDTO) {
        userId = userDTO.userId;
        firstName = userDTO.firstName;
        lastName = userDTO.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getUserId() {
        return userId;
    }
}