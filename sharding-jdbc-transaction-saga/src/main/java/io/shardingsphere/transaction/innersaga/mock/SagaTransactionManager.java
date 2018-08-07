/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.transaction.innersaga.mock;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Actual saga transaction manager.
 * need service comb implement
 *
 * @author yangyi
 */

public interface SagaTransactionManager {
    
    /**
     * create a new saga transaction for current thread.
     *
     * @return new transaction
     */
    SagaTransaction getTransaction();
    
    /**
     * Get connection for transaction manager.
     *
     * @param dataSourceName data source name for transaction manager
     * @return connection for transaction manager
     * @throws SQLException SQL exception
     */
    Connection getTargetConnection(String dataSourceName) throws SQLException;
    
}