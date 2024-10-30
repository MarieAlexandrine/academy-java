-- Create the "Feed" table
CREATE TABLE "feed"(
  "feedId" INTEGER GENERATED ALWAYS AS IDENTITY,
  "userId" INTEGER NOT NULL,
  "content" VARCHAR(1000) NOT NULL,
  "picture" VARCHAR(1000) NOT NULL,
  "createdOn" TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  CONSTRAINT "feedUserId" FOREIGN KEY("userId")
      REFERENCES "user"("userId"),
  CONSTRAINT "feedPKey" PRIMARY KEY("feedId")
);

-- -- Insert a new row into the "Feed" table.
INSERT INTO "feed"("userId", "content", "picture","createdOn")
  VALUES(2, 'This is my first post!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg', NOW());

-- -- Insert two new rows into the "Feed" table for other users.
INSERT INTO "feed"("userId", "content", "picture","createdOn")
  VALUES(2, 'Hello World!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg', NOW());

INSERT INTO "feed"("userId", "content", "picture","createdOn")
  VALUES(5, 'I love this app!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg', NOW());

-- -- Select all rows from the "Feed" table
SELECT * FROM "feed";

-- -- Update the feed content for the feed with feedId = 1
UPDATE "feed" SET "content"='This is now edited' WHERE "feedId"=1;

-- -- Delete feed with feedId = 2
--DELETE FROM "feed" WHERE "feedId"=2;
--SELECT * FROM "feed" WHERE "feedId" = 1;

-- -- Join the "User" and "Feed" tables.
--SELECT * FROM "feed" AS "f" FULL OUTER JOIN "user" AS "u" ON "f"."userId"="u"."userId";

-- -- Join the "User" and "Feed" tables to display the rows for username = 'amylee'
SELECT * FROM "feed" AS "f" INNER JOIN "user" AS "u" ON "f"."userId"="u"."userId" WHERE "u"."username"='amylee';
