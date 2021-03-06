/*
 * ******************************************************************************
 * sdrtrunk
 * Copyright (C) 2014-2018 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * *****************************************************************************
 */
package io.github.dsheirer.module.decode.p25.identifier.encryption;

import io.github.dsheirer.identifier.Form;
import io.github.dsheirer.identifier.IdentifierClass;
import io.github.dsheirer.identifier.Role;
import io.github.dsheirer.identifier.encryption.EncryptionKey;
import io.github.dsheirer.identifier.encryption.EncryptionKeyIdentifier;
import io.github.dsheirer.protocol.Protocol;

public class APCO25EncryptionKey extends EncryptionKeyIdentifier
{
    public APCO25EncryptionKey(EncryptionKey encryptionKey)
    {
        super(encryptionKey, IdentifierClass.NETWORK, Form.ENCRYPTION_KEY, Role.BROADCAST);
    }

    @Override
    public Protocol getProtocol()
    {
        return Protocol.APCO25;
    }

    /**
     * Creates a new APCO-25 encryption algorithm
     */
    public static APCO25EncryptionKey create(int alogorithm, int keyId)
    {
        return new APCO25EncryptionKey(new EncryptionKey(alogorithm, keyId));
    }
}
