/*
  Warnings:

  - You are about to alter the column `PHOTO` on the `statement` table. The data in that column could be lost. The data in that column will be cast from `Blob` to `VarChar(191)`.

*/
-- AlterTable
ALTER TABLE `statement` MODIFY `PHOTO` VARCHAR(191) NOT NULL;
