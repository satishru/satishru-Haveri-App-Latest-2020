package application.haveri.tourism.data.local.db.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import application.haveri.tourism.data.model.db.HaveriData;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HaveriDataDao_Impl implements HaveriDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HaveriData> __insertionAdapterOfHaveriData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HaveriDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHaveriData = new EntityInsertionAdapter<HaveriData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `haveri_data` (`id`,`json_data`,`created_at`,`updated_at`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HaveriData value) {
        if (value.id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.id);
        }
        if (value.jsonData == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.jsonData);
        }
        if (value.createdAt == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.createdAt);
        }
        if (value.updatedAt == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.updatedAt);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM haveri_data";
        return _query;
      }
    };
  }

  @Override
  public void insert(final HaveriData data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHaveriData.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Single<List<HaveriData>> getHaveriData() {
    final String _sql = "SELECT * FROM haveri_data";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<HaveriData>>() {
      @Override
      public List<HaveriData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfJsonData = CursorUtil.getColumnIndexOrThrow(_cursor, "json_data");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<HaveriData> _result = new ArrayList<HaveriData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HaveriData _item;
            _item = new HaveriData();
            if (_cursor.isNull(_cursorIndexOfId)) {
              _item.id = null;
            } else {
              _item.id = _cursor.getLong(_cursorIndexOfId);
            }
            _item.jsonData = _cursor.getString(_cursorIndexOfJsonData);
            _item.createdAt = _cursor.getString(_cursorIndexOfCreatedAt);
            _item.updatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
