-- Define and Create the store procedure as instructed (steps 1 to 8)
CREATE OR REPLACE PROCEDURE "userInsertFeed"("_userId" INTEGER, "_content" VARCHAR, "_picture" VARCHAR)
LANGUAGE plpgsql
AS
$$
  DECLARE "userExists" INTEGER := 0;
  BEGIN
    SELECT COUNT("userId") FROM "user" INTO "userExists"
      WHERE "userId" = "_userId";
  IF "userExists" != 1 THEN
    RAISE NOTICE 'Invalid user details';
  ELSE
     INSERT INTO "feed" ("userId", "content", "picture", "createdOn")
      VALUES ("_userId", "_content", "_picture", NOW());
  END IF;
END;
$$;
-- Call the procedure by passing values.
CALL "userInsertFeed"(6, 'It''s Friday!', 'https://example.com/picture.jpg');
-- Select all rows from the “Feed” table
SELECT * FROM "feed";