import { Module } from '@nestjs/common';
import { StatementController } from './statement.controller';
import { StatementService } from './statement.service';
import { PrismaClient } from '@prisma/client';

@Module({
  controllers: [StatementController],
  providers: [StatementService, PrismaClient]
})
export class StatementModule {}
