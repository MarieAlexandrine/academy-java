CREATE TABLE "feedMetaData"("feedMetaDataId" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
      "feedId" INTEGER NOT NULL,
      "actionUserId" INTEGER NOT NULL,
      "isLike" BOOLEAN NOT NULL,
      "comment" VARCHAR(1000),
      "createdOn" TIMESTAMP WITHOUT TIME ZONE NOT NULL,
      CONSTRAINT "feedMetaDataPkey" PRIMARY KEY ("feedMetaDataId"),
      CONSTRAINT "feedMetaDataActionUserIdFkey" FOREIGN KEY ("actionUserId") REFERENCES "user"("userId"),
      CONSTRAINT "feedMetaDataFeedIdFkey" FOREIGN KEY ("feedId") REFERENCES "feed"("feedId")
    );
	-- Insert a new row into the "FeedMetaData" table.
	-- INSERT INTO "feedMetaData"("actionUserId", "feedId", "isLike", "comment","createdOn")
	-- VALUES (2, 1, true, 'Thanks!',NOW());
	-- INSERT INTO "feedMetaData"("actionUserId", "feedId", "isLike", "comment","createdOn")
	-- VALUES (4, 3,false, 'Just Wow!',NOW()),
	--  (5,6,true,'What a beautiful day', NOW());
	

--Update the feedMetaData content for the feedMetaData with feedMetaDataId = 1
UPDATE "feedMetaData" SET "comment"= 'Thanks fam!' WHERE "feedMetaDataId" =1;

-- Delete feedMetaData with feedMetaDataId = 2
DELETE FROM "feedMetaData" WHERE "feedMetaDataId"=2;
-- Select all rows from the "FeedMetaData" table.
SELECT * FROM "feedMetaData";
-- Select feedMetaData with feedMetaDataId = 1
SELECT * FROM "feedMetaData" WHERE "feedMetaDataId"=1;
-- Join the "Feed" and "FeedMetaData" tables to display a row (or rows) for feedId = 1
SELECT * FROM "feed" AS "f" FULL OUTER JOIN "feedMetaData" AS "md" ON "f"."feedId"="md"."feedId" WHERE "md"."feedId"=1;
-- Join the "User", "Feed" and "FeedMetaData" tables to display a row (or rows) for userId = 2
SELECT * FROM "user" AS "u" LEFT OUTER JOIN "feed" AS "f" ON "u"."userId"= "f"."userId"
LEFT OUTER JOIN "feedMetaData" AS "md" ON "f"."feedId" = "md"."feedId" WHERE "u"."userId"= 2;


