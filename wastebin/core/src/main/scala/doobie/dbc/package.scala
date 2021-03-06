package doobie

import java.sql

/** Pure functional low-level JDBC layer. */
package object dbc {

  object callablestatement extends op.CallableStatementOps
  object connection        extends op.ConnectionOps
  object databasemetadata  extends op.DatabaseMetaDataOps
  object parametermetadata extends op.ParameterMetaDataOps
  object preparedstatement extends op.PreparedStatementOps[sql.PreparedStatement]
  object resultset         extends op.ResultSetOps
  object resultsetmetadata extends op.ResultSetMetaDataOps
  object statement         extends op.StatementOps[sql.Statement]

  type Connection[A]        = connection.Action[A]  
  type Statement[A]         = statement.Action[A]
  type DatabaseMetaData[A]  = databasemetadata.Action[A]
  type CallableStatement[A] = callablestatement.Action[A]
  type ParameterMetaData[A] = parametermetadata.Action[A]
  type PreparedStatement[A] = preparedstatement.Action[A]
  type ResultSet[A]         = resultset.Action[A]
  type ResultSetMetaData[A] = resultsetmetadata.Action[A]

}

