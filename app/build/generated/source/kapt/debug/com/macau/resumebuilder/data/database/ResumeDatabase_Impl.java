package com.macau.resumebuilder.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ResumeDatabase_Impl extends ResumeDatabase {
  private volatile ResumeDao _resumeDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `resumes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `basicInfoJson` TEXT NOT NULL, `educationJson` TEXT NOT NULL, `experienceJson` TEXT NOT NULL, `skillsJson` TEXT NOT NULL, `awardsJson` TEXT NOT NULL, `activitiesJson` TEXT NOT NULL, `templateId` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '959d26415e540be9015bb2f5f00a0180')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `resumes`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsResumes = new HashMap<String, TableInfo.Column>(10);
        _columnsResumes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("basicInfoJson", new TableInfo.Column("basicInfoJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("educationJson", new TableInfo.Column("educationJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("experienceJson", new TableInfo.Column("experienceJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("skillsJson", new TableInfo.Column("skillsJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("awardsJson", new TableInfo.Column("awardsJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("activitiesJson", new TableInfo.Column("activitiesJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("templateId", new TableInfo.Column("templateId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResumes.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResumes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResumes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoResumes = new TableInfo("resumes", _columnsResumes, _foreignKeysResumes, _indicesResumes);
        final TableInfo _existingResumes = TableInfo.read(db, "resumes");
        if (!_infoResumes.equals(_existingResumes)) {
          return new RoomOpenHelper.ValidationResult(false, "resumes(com.macau.resumebuilder.data.database.ResumeEntity).\n"
                  + " Expected:\n" + _infoResumes + "\n"
                  + " Found:\n" + _existingResumes);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "959d26415e540be9015bb2f5f00a0180", "582133522d94304c993e3a70a380a1c7");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "resumes");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `resumes`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ResumeDao.class, ResumeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public ResumeDao resumeDao() {
    if (_resumeDao != null) {
      return _resumeDao;
    } else {
      synchronized(this) {
        if(_resumeDao == null) {
          _resumeDao = new ResumeDao_Impl(this);
        }
        return _resumeDao;
      }
    }
  }
}
