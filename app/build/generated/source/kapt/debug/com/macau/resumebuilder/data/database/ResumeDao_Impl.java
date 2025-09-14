package com.macau.resumebuilder.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ResumeDao_Impl implements ResumeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ResumeEntity> __insertionAdapterOfResumeEntity;

  private final EntityDeletionOrUpdateAdapter<ResumeEntity> __deletionAdapterOfResumeEntity;

  private final EntityDeletionOrUpdateAdapter<ResumeEntity> __updateAdapterOfResumeEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteResumeById;

  public ResumeDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResumeEntity = new EntityInsertionAdapter<ResumeEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `resumes` (`id`,`basicInfoJson`,`educationJson`,`experienceJson`,`skillsJson`,`awardsJson`,`activitiesJson`,`templateId`,`createdAt`,`updatedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ResumeEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getBasicInfoJson() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBasicInfoJson());
        }
        if (entity.getEducationJson() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEducationJson());
        }
        if (entity.getExperienceJson() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getExperienceJson());
        }
        if (entity.getSkillsJson() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSkillsJson());
        }
        if (entity.getAwardsJson() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getAwardsJson());
        }
        if (entity.getActivitiesJson() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getActivitiesJson());
        }
        if (entity.getTemplateId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getTemplateId());
        }
        statement.bindLong(9, entity.getCreatedAt());
        statement.bindLong(10, entity.getUpdatedAt());
      }
    };
    this.__deletionAdapterOfResumeEntity = new EntityDeletionOrUpdateAdapter<ResumeEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `resumes` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ResumeEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfResumeEntity = new EntityDeletionOrUpdateAdapter<ResumeEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `resumes` SET `id` = ?,`basicInfoJson` = ?,`educationJson` = ?,`experienceJson` = ?,`skillsJson` = ?,`awardsJson` = ?,`activitiesJson` = ?,`templateId` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ResumeEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getBasicInfoJson() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBasicInfoJson());
        }
        if (entity.getEducationJson() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEducationJson());
        }
        if (entity.getExperienceJson() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getExperienceJson());
        }
        if (entity.getSkillsJson() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSkillsJson());
        }
        if (entity.getAwardsJson() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getAwardsJson());
        }
        if (entity.getActivitiesJson() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getActivitiesJson());
        }
        if (entity.getTemplateId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getTemplateId());
        }
        statement.bindLong(9, entity.getCreatedAt());
        statement.bindLong(10, entity.getUpdatedAt());
        statement.bindLong(11, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteResumeById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM resumes WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertResume(final ResumeEntity resume,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfResumeEntity.insertAndReturnId(resume);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteResume(final ResumeEntity resume,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfResumeEntity.handle(resume);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateResume(final ResumeEntity resume,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfResumeEntity.handle(resume);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteResumeById(final long id, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteResumeById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteResumeById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ResumeEntity>> getAllResumes() {
    final String _sql = "SELECT * FROM resumes ORDER BY updatedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"resumes"}, new Callable<List<ResumeEntity>>() {
      @Override
      @NonNull
      public List<ResumeEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBasicInfoJson = CursorUtil.getColumnIndexOrThrow(_cursor, "basicInfoJson");
          final int _cursorIndexOfEducationJson = CursorUtil.getColumnIndexOrThrow(_cursor, "educationJson");
          final int _cursorIndexOfExperienceJson = CursorUtil.getColumnIndexOrThrow(_cursor, "experienceJson");
          final int _cursorIndexOfSkillsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "skillsJson");
          final int _cursorIndexOfAwardsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "awardsJson");
          final int _cursorIndexOfActivitiesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "activitiesJson");
          final int _cursorIndexOfTemplateId = CursorUtil.getColumnIndexOrThrow(_cursor, "templateId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final List<ResumeEntity> _result = new ArrayList<ResumeEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ResumeEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpBasicInfoJson;
            if (_cursor.isNull(_cursorIndexOfBasicInfoJson)) {
              _tmpBasicInfoJson = null;
            } else {
              _tmpBasicInfoJson = _cursor.getString(_cursorIndexOfBasicInfoJson);
            }
            final String _tmpEducationJson;
            if (_cursor.isNull(_cursorIndexOfEducationJson)) {
              _tmpEducationJson = null;
            } else {
              _tmpEducationJson = _cursor.getString(_cursorIndexOfEducationJson);
            }
            final String _tmpExperienceJson;
            if (_cursor.isNull(_cursorIndexOfExperienceJson)) {
              _tmpExperienceJson = null;
            } else {
              _tmpExperienceJson = _cursor.getString(_cursorIndexOfExperienceJson);
            }
            final String _tmpSkillsJson;
            if (_cursor.isNull(_cursorIndexOfSkillsJson)) {
              _tmpSkillsJson = null;
            } else {
              _tmpSkillsJson = _cursor.getString(_cursorIndexOfSkillsJson);
            }
            final String _tmpAwardsJson;
            if (_cursor.isNull(_cursorIndexOfAwardsJson)) {
              _tmpAwardsJson = null;
            } else {
              _tmpAwardsJson = _cursor.getString(_cursorIndexOfAwardsJson);
            }
            final String _tmpActivitiesJson;
            if (_cursor.isNull(_cursorIndexOfActivitiesJson)) {
              _tmpActivitiesJson = null;
            } else {
              _tmpActivitiesJson = _cursor.getString(_cursorIndexOfActivitiesJson);
            }
            final String _tmpTemplateId;
            if (_cursor.isNull(_cursorIndexOfTemplateId)) {
              _tmpTemplateId = null;
            } else {
              _tmpTemplateId = _cursor.getString(_cursorIndexOfTemplateId);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ResumeEntity(_tmpId,_tmpBasicInfoJson,_tmpEducationJson,_tmpExperienceJson,_tmpSkillsJson,_tmpAwardsJson,_tmpActivitiesJson,_tmpTemplateId,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
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

  @Override
  public Object getResumeById(final long id, final Continuation<? super ResumeEntity> $completion) {
    final String _sql = "SELECT * FROM resumes WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ResumeEntity>() {
      @Override
      @Nullable
      public ResumeEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBasicInfoJson = CursorUtil.getColumnIndexOrThrow(_cursor, "basicInfoJson");
          final int _cursorIndexOfEducationJson = CursorUtil.getColumnIndexOrThrow(_cursor, "educationJson");
          final int _cursorIndexOfExperienceJson = CursorUtil.getColumnIndexOrThrow(_cursor, "experienceJson");
          final int _cursorIndexOfSkillsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "skillsJson");
          final int _cursorIndexOfAwardsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "awardsJson");
          final int _cursorIndexOfActivitiesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "activitiesJson");
          final int _cursorIndexOfTemplateId = CursorUtil.getColumnIndexOrThrow(_cursor, "templateId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final ResumeEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpBasicInfoJson;
            if (_cursor.isNull(_cursorIndexOfBasicInfoJson)) {
              _tmpBasicInfoJson = null;
            } else {
              _tmpBasicInfoJson = _cursor.getString(_cursorIndexOfBasicInfoJson);
            }
            final String _tmpEducationJson;
            if (_cursor.isNull(_cursorIndexOfEducationJson)) {
              _tmpEducationJson = null;
            } else {
              _tmpEducationJson = _cursor.getString(_cursorIndexOfEducationJson);
            }
            final String _tmpExperienceJson;
            if (_cursor.isNull(_cursorIndexOfExperienceJson)) {
              _tmpExperienceJson = null;
            } else {
              _tmpExperienceJson = _cursor.getString(_cursorIndexOfExperienceJson);
            }
            final String _tmpSkillsJson;
            if (_cursor.isNull(_cursorIndexOfSkillsJson)) {
              _tmpSkillsJson = null;
            } else {
              _tmpSkillsJson = _cursor.getString(_cursorIndexOfSkillsJson);
            }
            final String _tmpAwardsJson;
            if (_cursor.isNull(_cursorIndexOfAwardsJson)) {
              _tmpAwardsJson = null;
            } else {
              _tmpAwardsJson = _cursor.getString(_cursorIndexOfAwardsJson);
            }
            final String _tmpActivitiesJson;
            if (_cursor.isNull(_cursorIndexOfActivitiesJson)) {
              _tmpActivitiesJson = null;
            } else {
              _tmpActivitiesJson = _cursor.getString(_cursorIndexOfActivitiesJson);
            }
            final String _tmpTemplateId;
            if (_cursor.isNull(_cursorIndexOfTemplateId)) {
              _tmpTemplateId = null;
            } else {
              _tmpTemplateId = _cursor.getString(_cursorIndexOfTemplateId);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _result = new ResumeEntity(_tmpId,_tmpBasicInfoJson,_tmpEducationJson,_tmpExperienceJson,_tmpSkillsJson,_tmpAwardsJson,_tmpActivitiesJson,_tmpTemplateId,_tmpCreatedAt,_tmpUpdatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
