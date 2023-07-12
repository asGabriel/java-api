/*
  Warnings:

  - You are about to alter the column `PHOTO` on the `statement` table. The data in that column could be lost. The data in that column will be cast from `TinyInt` to `Blob`.

*/
-- AlterTable
ALTER TABLE `statement` MODIFY `PHOTO` BLOB NOT NULL;
