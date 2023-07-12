import { HttpStatus, Injectable } from '@nestjs/common';
import { PrismaClient } from '@prisma/client';
import { StatementEntityDto } from './dto/statement-entity.dto';

@Injectable()
export class StatementService {
    constructor(
        private readonly prismaClient: PrismaClient
    ) {}

    async createStatement(data: StatementEntityDto) {
        const newStatement = await this.prismaClient.statement.create({
            data:{
                PHOTO: data.PHOTO,
                STATEMENT: data.STATEMENT,
                CREATEDBY: data.CREATEDBY
            }
        })

        return {
            status: HttpStatus.CREATED,
            response: newStatement
        }
    }
}
